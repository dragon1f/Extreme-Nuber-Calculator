import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for (int index = 0; index < 1; index++) {
        int function = 1;
        //(int)(Math.random() * (1 - 0 + 1) + 0);
        //0 - addition
        //1 - subtraction
        //2 - multiplication
        //3 - division
        int operation = function;
        ArrayList<Integer> whole1 = new ArrayList<Integer>();
        ArrayList<Integer> decimal1 = new ArrayList<Integer>();
        int pol1 = (int)(Math.random() * (1 - 0 + 1) + 0);
        int wam1 = 0;
        int dam1 = 0;
        int pam1 = 0;
        ArrayList<Integer> whole2 = new ArrayList<Integer>();
        ArrayList<Integer> decimal2 = new ArrayList<Integer>();
        int pol2 = (int)(Math.random() * (1 - 0 + 1) + 0);
        int wam2 = 0;
        int dam2 = 0;
        int pam2 = 0;
        ArrayList<Integer> whole3 = new ArrayList<Integer>();
        ArrayList<Integer> decimal3 = new ArrayList<Integer>();
        int pol3 = 0;
        int wam3 = 0;
        int dam3 = 0;
        int pam3 = 0;
        ArrayList<Integer> wholeprocess = new ArrayList<Integer>();
        ArrayList<Integer> decimalprocess = new ArrayList<Integer>();
        int polprocess = 0;
        int wamprocess = 0;
        int damprocess = 0;
        int pamprocess = 0;
        int comparator = 0;

        //  whole X             whole part of number
        //
        //  decimal X           decimal part of number
        //
        //  pol X               polarity
        //          polx = 0    x is positive
        //          polx = 1    x is negative
        //
        //  wam X               number of digits that makes whole part
        //
        //  dam X               number of digits that makes decimal part
        //  pam X               number of digits that makes periodical part of decimal part
        //
        //      !!!   pamX <= damX   !!!   ALWAYS TRUE   !!!
    
        //numbers to write
    
        long wnum1_1 = 0;
        long wnum1_2 = 0; 
        long wnum1_3 = 0; 
        long wnum1_4 = 0; 
        long wnum1_5 = 0; 
        long wnum1_6 = 0; 
        long wnum1_7 = 0; 
        long wnum1_8 = 0; 
        long wnum1_9 = 0; 
        long wnum1_10 = 0;

        long wnum2_1 = 0;
        long wnum2_2 = 0;
        long wnum2_3 = 0;
        long wnum2_4 = 0;
        long wnum2_5 = 0;
        long wnum2_6 = 0;
        long wnum2_7 = 0;
        long wnum2_8 = 0;
        long wnum2_9 = 0;
        long wnum2_10 = 0;

        wnum1_1 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_2 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_3 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_4 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_5 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_6 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_7 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_8 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);
        wnum1_9 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum1_10 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);

        wnum2_1 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_2 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_3 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_4 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_5 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_6 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_7 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_8 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_9 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000); 
        wnum2_10 = (int)(Math.random() * (999999999 - 100000000 + 1) + 100000000);


        //writer
        //1


        int loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_1%10));
            wnum1_1=(wnum1_1-wnum1_1%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_1%10));
            wnum2_1=(wnum2_1-wnum2_1%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_2%10));
            wnum1_2=(wnum1_2-wnum1_2%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_2%10));
            wnum2_2=(wnum2_2-wnum2_2%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_3%10));
            wnum1_3=(wnum1_3-wnum1_3%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_3%10));
            wnum2_3=(wnum2_3-wnum2_3%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_4%10));
            wnum1_4=(wnum1_4-wnum1_4%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_4%10));
            wnum2_4=(wnum2_4-wnum2_4%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_5%10));
            wnum1_5=(wnum1_5-wnum1_5%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_5%10));
            wnum2_5=(wnum2_5-wnum2_5%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_6%10));
            wnum1_6=(wnum1_6-wnum1_6%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_6%10));
            wnum2_6=(wnum2_6-wnum2_6%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_7%10));
            wnum1_7=(wnum1_7-wnum1_7%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_7%10));
            wnum2_7=(wnum2_7-wnum2_7%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_8%10));
            wnum1_8=(wnum1_8-wnum1_8%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_8%10));
            wnum2_8=(wnum2_8-wnum2_8%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_9%10));
            wnum1_9=(wnum1_9-wnum1_9%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_9%10));
            wnum2_9=(wnum2_9-wnum2_9%10)/10;wam2++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole1.add((int) (wnum1_10%10));
            wnum1_10=(wnum1_10-wnum1_10%10)/10;wam1++;
        }
        loopstop = 9;
        for ( int writerloop = 0; writerloop < loopstop; writerloop++) {
            whole2.add((int) (wnum2_10%10));
            wnum2_10=(wnum2_10-wnum2_10%10)/10;wam2++;
        }

        //comparator
        //0 - ?
        //1 - num1 < num2
        //2 - num1 = num2
        //3 - num1 > num2
        comparator = 2;
        for (int i = 0; i<wam1 || i<wam2; i++) {
            if (wam1<=i) {
                whole1.add(0);
            } 
            if (wam2<=i) {
                whole2.add(0);
            }

            if (whole1.get(i) < whole2.get(i) ) {
                comparator = 1; 
            } else if (whole1.get(i) == whole2.get(i)) {
            } else if (whole1.get(i) > whole2.get(i)) {
                comparator = 3;
            } else {                
            }
        }

        if (!(pol1 == pol2)) {
            switch (function) {
                case 0:
                //addition
                    function = 1;
                    break;
                case 1:
                //subtraction
                    function = 0;
                    break;
                case 2:
                //multiplification
                    pol3 = 1;
                    break;
                case 3:
                //division
                    pol3 = 1;
                    break;
            
                default:
                    break;
            }
        } else {
            
        }

        //operation
        switch (function) {
            case 0:
                //adder
                for (int i = 0; i<wam1+1 || i<wam2+1 ; i++) {
                    if (wam1<=i) {
                        whole1.add(0);
                    } 
                    if (wam2<=i) {
                        whole2.add(0);
                    }
                    whole3.add(((whole1.get(i) + whole2.get(i)+wamprocess)%10));
                    wamprocess=((whole1.get(i) + whole2.get(i)+wamprocess)-((whole1.get(i) + whole2.get(i)+wamprocess)%10))/10;
                }
                for (int i = 0; i<dam1+1 || i<dam2+1 ; i++) {
                    if (dam1<=i) {
                        decimal1.add(0);
                    } 
                    if (dam2<=i) {
                        decimal2.add(0);
                    }
                    decimal3.add(((decimal1.get(i) + decimal2.get(i)+damprocess)%10));
                    damprocess=((decimal1.get(i) + decimal2.get(i)+damprocess)-((decimal1.get(i) + decimal2.get(i)+damprocess)%10))/10;
                }

                pol3 = pol1;
                break;
            case 1:
                //subtractor
                switch (comparator) {
                    case 1:
                        for (int i = 0; i<wam1+1 || i<wam2+1 ; i++) {
                            if (wam1<=i) {
                                whole1.add(0);
                            } 
                            if (wam2<=i) {
                                whole2.add(0);
                            }
                            whole3.add(((whole2.get(i)+10+wamprocess) - whole1.get(i))%10);
                            wamprocess=(((whole2.get(i)+10+wamprocess) - whole1.get(i))-((whole2.get(i)+10+wamprocess) - whole1.get(i))%10)/10-1;
                        }
                        pol3 = ((comparator-2)*(comparator-2))*((pol1-1)*-1);
                        break;
                    default:
                        for (int i = 0; i<wam1+1 || i<wam2+1 ; i++) {
                            if (wam1<=i) {
                                whole1.add(0);
                            } 
                            if (wam2<=i) {
                                whole2.add(0);
                            }
                            whole3.add(((whole1.get(i)+10+wamprocess) - whole2.get(i))%10);
                            wamprocess=(((whole1.get(i)+10+wamprocess) - whole2.get(i))-((whole1.get(i)+10+wamprocess) - whole2.get(i))%10)/10-1;
                        }
                        pol3 = ((comparator-2)*(comparator-2))*pol1;
                        break;
                }
                break;
            case 2:
                //multiplier
                int mwam1 = wam1 ;
                int mwam2 = wam2 ;
                int reminder = 0 ;
                for (int i = 0; i<wam1+1; i++) {
                    if (mwam1<i+1) {
                        whole1.add(0);
                    } 
                    for (int j = 0; j<wam2; j++) {
                                if (mwam2<j+1) {
                                        whole2.add(0);
                                }
                                for (;whole3.size()<=(i+j);) {
                                    whole3.add(0);
                                }
                                for (;wholeprocess.size()<=(i+j);) {
                                    wholeprocess.add(0);
                                }

                                wamprocess =(int)((whole3.get(i+j)+((whole1.get(i))*(whole2.get(j))) + reminder)%10);
                                reminder =(int)(((whole3.get(i+j)+((whole1.get(i))*(whole2.get(j))) + reminder)-((whole3.get(i+j)+((whole1.get(i))*(whole2.get(j))) + reminder)%10))/10);
                        
                                whole3.set((i+j),wamprocess);
                    }
                    whole3.add(0);
                    whole3.set((i+wam2),reminder);
                    reminder = 0;   
                }
                break;
            default:
                break;
            }





       
        //write out
        int ofset = 1;
        int no0start = 0;
        //num1
        if (pol1 == 1) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }
        for (int i = whole1.size()-ofset; i >= 0; i=i-1) {
            if (whole1.get(i)==0 && no0start==0) {
                System.out.print(" ");
            } else {
                no0start=1;
                System.out.print(whole1.get(i));
            }
        }
        
        no0start=0;
        System.out.println();
        
        //operator
        switch (operation) {
            case 0:
            System.out.println("+");
                break;
            case 1:
            System.out.println("-");
                break;
            case 2:
            System.out.println("*");
                break;
            case 3:
            System.out.println("/");
                break;
            default:
                break;
        }
        
        //num2
        if (pol2 == 1) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }
        for (int i = whole2.size()-ofset; i >= 0; i=i-1) {
            if (whole2.get(i)==0 && no0start==0) {
                System.out.print(" ");
            } else {
                no0start=1;
                System.out.print(whole2.get(i));
            }
        }
        no0start=0;
        System.out.println();
        System.out.println("=");
        
        //num3
        if (pol3 == 1) {
            System.out.print("-");
        } else {
            System.out.print(" ");
        }
        for (int i = whole3.size()-ofset; i >= 0; i=i-1) {
            if (whole3.get(i)==0 && no0start==0) {
                System.out.print(" ");
            } else {
                no0start=1;
                System.out.print(whole3.get(i));
            }
        }
        }
        

    }
}