package ex08.polling;

public class LotteMart {
    private String value = null;

    public String getValue(){
        return value;
    }

    public void received(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        value = "상품";
    }

}
