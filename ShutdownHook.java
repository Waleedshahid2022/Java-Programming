package GeeksforGeeks;

public class ShutdownHook {
    public static void main(String[] args)
    {

                Runtime.getRuntime().addShutdownHook(new Thread()
                {
                    public void run()
                    {
                        System.out.println("Shutdown Hook is running !");
                        int i=1;
                        int j=2;
                        int k =i+j;
                        System.out.println(k);
                    }
                });
                System.out.println("Application Terminating ...");
            }
        }

