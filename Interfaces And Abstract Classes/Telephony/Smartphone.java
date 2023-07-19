package InterfacesAndAbstractClasses_Ex.x05_Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable,Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers,List<String> urls){
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d");

        this.urls.forEach(number -> {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()){
                sb.append("Invalid URL!").append(System.lineSeparator());
            }else{
                String stringFormatting = String.format("Browsing: %s!",number);
                sb.append(stringFormatting).append(System.lineSeparator());
            }
        });
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\D");

        this.numbers.forEach(number -> {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()){
             sb.append("Invalid number!").append(System.lineSeparator());
            }else{
                String stringFormatting = String.format("Calling... %s",number);
              sb.append(stringFormatting).append(System.lineSeparator());
            }
        });
        return sb.toString();
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

}
