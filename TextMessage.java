public class TextMessage {
    public String newtext = "";

    TextMessage() {

    }

    public TextMessage(String contentOfMessage) {
        newtext = contentOfMessage.replaceAll("fuck","f**k").replaceAll("bullshit","b******t");
        System.out.println(this.newtext);
    }


}


