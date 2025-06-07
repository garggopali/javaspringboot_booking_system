@RestController
@RequestMapping("/booking")
public class BookingController{
    @autowire
    BookingService bookingService;

    BookingController(){

    }

    @GetMapping("/add")
    private String getBooking(@PathVariable(Name="name")String cusName){
        Customer cust=new Customer("GG");
        return bookingService.addCust(cust);
    }
}
