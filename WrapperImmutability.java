public class WrapperImmutability{
              public static void main(String[] args){
                            Integer num1=10;
                            Integer num2=num1;
                            num1=num1+5;
                            
                            
                            System.out.println("num1:"+num1);
                            System.out.println("num2:"+num2);
                            System.out.println("are num1 and num2 same object?"+(num1==num2));
                            
                            
                            
                          double d1=5.5;
                          double d2=d1;
                          d1=d1*2;
                          
                          
                          System.out.println("d1:"+d1);
                          System.out.println("d2:"+d2);
                          System.out.println("ared1 and d2 same object?"+(d1==d2));
                          }
                          }
                        
                          
