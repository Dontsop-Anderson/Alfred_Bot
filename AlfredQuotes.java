import java.time.LocalTime;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    // See the specs to overload the guestGreeting method
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // Ninja Bonus Version!
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    
    // SENSEI BONUS
    public String guestGreeting() {
        LocalTime time = LocalTime.now();
        int hours = time.getHour();
        String dayPeriod;
        
        if(hours >= 0 && hours < 12) {
            dayPeriod = "morning";
        } else if(hours >= 12 && hours < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        
        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String angryQuote(String quote) {
        return quote.toUpperCase() + "!!!";
    }

	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

