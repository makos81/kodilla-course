package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private OrderService orderService;
    private OrderInformer orderInformer;
    private OrderSaver orderSaver;

    public ProductOrderProcessor(OrderService orderService, OrderInformer orderInformer, OrderSaver orderSaver) {
        this.orderService = orderService;
        this.orderInformer = orderInformer;
        this.orderSaver = orderSaver;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest);
        if(isOrdered){
            orderInformer.sendMessage(orderRequest.getBuyer());
            orderInformer.sendMessage(orderRequest.getSeller());
            orderSaver.saveOrder(orderRequest);
            return new OrderDto(orderRequest.getSeller(), orderRequest.getBuyer(), true);
        }else{
            return new OrderDto(orderRequest.getSeller(), orderRequest.getBuyer(), false);
        }

    }

    /*
    Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów – gier, kapcie, szczoteczek do zębów... innymi słowy,
    Allegro :)

    public class RentalProcessor {

   private InformationService informationService;
   private RentalService rentalService;
   private RentalRepository rentalRepository;

   public RentalProcessor(final InformationService informationService,
         final RentalService rentalService,
         final RentalRepository rentalRepository) {
      this.informationService = informationService;
      this.rentalService = rentalService;
      this.rentalRepository = rentalRepository;
   }

   public RentalDto process(final RentRequest rentRequest) {
      boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
         rentRequest.getTo());

      if (isRented) {
         informationService.inform(rentRequest.getUser());
         rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
         return new RentalDto(rentRequest.getUser(), true);
      } else {
         return new RentalDto(rentRequest.getUser(), false);
      }
   }
}
     */


}
