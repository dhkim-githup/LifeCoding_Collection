public class ExceptionApp {

    public static void main(String[] args) {
        System.out.println(1);

        int[] scores ={10,20,30};

        try {
            System.out.println(scores[3]);
            System.out.println(2/0);
        }catch (Exception e){
            System.out.println("오류가 발생");
            e.printStackTrace();
        }

        /*
        }catch (ArithmeticException e) {
            System.out.println("잘못된 계산이네요."+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("없는 값을 찾고 계시네요."+e);
        }
        */


        System.out.println(5);
    }
}
