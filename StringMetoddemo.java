class StringMetoddemo {

    public void LoginProcess(String username, String Password)
            {
                
                int x=username.compareTo("shivani");
                int y=Password.compareTo("admin");
                if(x==0 && y==0)
                {
                    System.out.println("Login Success");
                }
                else{
                    System.out.println("Login Failed");
                }
            }

        public static void main(String[] args) {
            String s1="Akhil";
            String s2="akhil";
            System.out.println(s1.indexOf('A'));
            System.out.println(s1.charAt(0));

            int n=s1.compareTo(s2);
            System.out.println(n);

            if(n!=0)
            {
                System.out.println("Strings are not Equal");
            }
            else{
                System.out.println("Strings are Equal");
            }
            String userid="shivani";
            String pswd="admin";
            StringMetoddemo demo= new StringMetoddemo();
            demo.LoginProcess(userid,pswd);

            System.out.println(s1.indexOf('r'));

            String s3="Java is high level object oriented programming langauge";

            String[] sarr=s3.split(" ");

            for (String word : sarr) {
                System.out.println(word + " "+word.length());
                
            }

           
        }


}
