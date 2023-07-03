public class Account {
        int a,b;
        public void setData(int a, int b){
            this.a = a;
            this.b = b;
        }
        public void showData(){
            System.out.println("Value of A="+a);
            System.out.println("Value of B=" +b);
        }
        public static void main(String[] args){
//            Account obj= new Account();
//            obj.setData(2,3);
//            obj.showData();
            int x = 4;
            int y = 3;
            double t=(double) x/y;
            double f = Double.valueOf(x/y);
            System.out.format("%.2f",t);
            System.out.println();
            System.out.println(f);

            Throwable throwable = new Throwable();
            throwable.printStackTrace();
        }


}
