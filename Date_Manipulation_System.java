import java.util.Scanner;//importing the scanner class
import java.io.*;//importing the character class
class Date_Manipulation_System//naming the class
{
    public static void main() throws IOException//calling the main function
    {
        Scanner sc = new Scanner(System.in);//creating an object 'sc' of the Scanner class
        String username [] = {"MahekM","FaridaY","MustafaY"};//storing three usernames in the String array 'username'
        int password [] = {12345,23974,61147};//storing passwords for the respective usernames in the integer array 'password'
        System.out.println();
        System.out.println("Welcome to the Date Manipulation System!!");
        System.out.println("Please enter your username.");//asking the user to enter the username
        String usnm = sc.nextLine();//accepting the username from the user
        System.out.println("Please enter your password.");//asking the user to enter the password
        int pswd = sc.nextInt();//accepting the password from the user
        boolean chk = false;//initialising boolean literal 'chk' as false
        char ans,choice,ansr,dum,dum1,dum2,dum3;//initialising character variables 'ans','choice' and 'ansr'
        for (int i = 0 ; i<3 ; i+=1)//running a loop to check the username and password
        {
            if ((usnm.equals(username[i])) && (pswd==password[i]))//checking if the user has entered the correct username and password 
            {
                System.out.println("Welcome " + username[i]);
                System.out.println();
                chk = true;
                do
                {
                    String dummy = sc.nextLine();
                    System.out.println("Please enter a date in one of the following formats.");//asking the user to enter a date
                    System.out.println("1) dd/mm/yyyy");
                    System.out.println("2) dd.mm.yyyy");
                    System.out.println("3) dd-mm-yyyy");
                    String g = sc.nextLine();//accepting the date from the user
                    System.out.println();
                    g = g.trim();//removing white spaces
                    if (g.length()==10)
                    {
                        String d = g.substring(0,2);
                        String m = g.substring(3,5);
                        String y = g.substring(6);
                        String months [] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                        int days [] = new int [12];//declaring the integer array 'days' to store the number of days in each month
                        int q = 0;
                        char c ;
                        for (int j = 0; j<y.length(); j+=1)
                        {
                            c = y.charAt(j);
                            if (Character.isDigit(c)==true)
                            {
                                int p = 0;
                                switch(c)
                                {
                                    case '0':
                                    p = 0;
                                    break;
                                    case '1':
                                    p = 1;
                                    break;
                                    case '2':
                                    p = 2;
                                    break;
                                    case '3':
                                    p = 3;
                                    break;
                                    case '4':
                                    p = 4;
                                    break;
                                    case '5':
                                    p = 5;
                                    break;
                                    case '6':
                                    p = 6;
                                    break;
                                    case '7':
                                    p = 7;
                                    break;
                                    case '8':
                                    p = 8;
                                    break;
                                    case '9':
                                    p = 9;
                                    break;
                                }
                                switch(j)
                                {
                                    case 0:
                                    p = p*1000;
                                    break;
                                    case 1:
                                    p = p*100;
                                    break;
                                    case 2:
                                    p = p*10;
                                    break;
                                    case 3:
                                    p = p*1;
                                    break;
                                }
                                q = q + p;//storing the year as an integer in variable q 
                            }
                            else
                            {
                                System.out.println("INVALID DATE");
                                break;
                            }
                        }
                        for (int k = 0; k<12 ; k+=1)//running a loop to store number of days in each month
                        {
                            switch (k)
                            {
                                case 0:
                                days[k] = 31;
                                break;
                                case 1:
                                if (((q%4)==0)&&((q%100!=0)||((q%400)==0)))//checking if it is a leap year
                                    days[k] = 29;
                                else
                                    days[k] = 28;
                                break;
                                case 2:
                                days[k] = 31;
                                break;
                                case 3:
                                days[k] = 30;
                                break;
                                case 4:
                                days[k] = 31;
                                break;
                                case 5:
                                days[k] = 30;
                                break;
                                case 6:
                                days[k] = 31;
                                break;
                                case 7:
                                days[k] = 31;
                                break;
                                case 8:
                                days[k] = 30;
                                break;
                                case 9:
                                days[k] = 31;
                                break;
                                case 10:
                                days[k] = 30;
                                break;
                                case 11:
                                days[k] = 31;
                                break;
                            }
                        }
                        int x = 0;
                        int u;
                        char ch ;
                        for (int l = 0; l<m.length(); l+=1)
                        {
                            ch = m.charAt(l);
                            if (Character.isDigit(ch)==true)
                            {
                                u = 0;
                                switch(ch)
                                {
                                    case '0':
                                    u = 0;
                                    break;
                                    case '1':
                                    u = 1;
                                    break;
                                    case '2':
                                    u = 2;
                                    break;
                                    case '3':
                                    u = 3;
                                    break;
                                    case '4':
                                    u = 4;
                                    break;
                                    case '5':
                                    u = 5;
                                    break;
                                    case '6':
                                    u = 6;
                                    break;
                                    case '7':
                                    u = 7;
                                    break;
                                    case '8':
                                    u = 8;
                                    break;
                                    case '9':
                                    u = 9;
                                    break;
                                }
                                switch (l)
                                {
                                    case 0:
                                    u = u*10;
                                    break;
                                    case 1:
                                    u = u*1;
                                    break;
                                }
                                x = x + u;//storing the month as an integer in variable x
                            }
                            else
                            {
                                System.out.println("INVALID DATE");
                                break;
                            }
                        }
                        int w = 0;
                        int v;
                        char ch1 ;
                        for (int n = 0; n<d.length(); n+=1)
                        {
                            ch1 = d.charAt(n);
                            if (Character.isDigit(ch1)==true)
                            {
                                v = 0;
                                switch(ch1)
                                {
                                    case '0':
                                    v = 0;
                                    break;
                                    case '1':
                                    v = 1;
                                    break;
                                    case '2':
                                    v = 2;
                                    break;
                                    case '3':
                                    v = 3;
                                    break;
                                    case '4':
                                    v = 4;
                                    break;
                                    case '5':
                                    v = 5;
                                    break;
                                    case '6':
                                    v = 6;
                                    break;
                                    case '7':
                                    v = 7;
                                    break;
                                    case '8':
                                    v = 8;
                                    break;
                                    case '9':
                                    v = 9;
                                    break;
                                }
                                switch (n)
                                {
                                    case 0:
                                    v = v*10;
                                    break;
                                    case 1:
                                    v = v*1;
                                    break;
                                }
                                w = w + v;//storing the date as an integer in variable w
                            }
                            else
                            {
                                System.out.println("INVALID DATE");
                                break;
                            }
                        }
                        int cd = 12;//current date
                        int cm = 4;//current month
                        int cy = 2023;//current year
                        if ((w==cd)&&(x==cm))
                            System.out.println("HAPPY BIRTHDAY !!!!");
                        if ((w==1)&&(x==1))
                            System.out.println("HAPPY NEW YEAR !!!!");
                        int q1 = q;
                        if ((x<13) && (w<=days[x-1]))
                        {
                            System.out.println("Valid Date");
                            System.out.println("Enter a random character to continue.");
                            do
                            {                           
                                dum2 = (char)System.in.read();
                                System.out.println("a) Printing the date in full");
                                System.out.println("b) Finding the number of days between the input date and the current date");
                                System.out.println("c) Printing the corresponding day of the year");
                                System.out.println("d) Find the future date after a certain number of days and predict the day of the week on the future date.");
                                System.out.println("Please enter your choice : a/b/c/d");
                                dum3 = (char)System.in.read();
                                choice = (char)System.in.read();//accepting the user's choice
                                System.out.println();
                                q = q1;
                                String o, o1;
                                switch(choice)
                                {
                                    case 'a':
                                    if ((w%10)==1)
                                        o = "st";
                                    else if ((w%10==2))
                                        o = "nd";
                                    else if ((w%10)==3)
                                        o = "rd";
                                    else
                                        o = "th";
                                    System.out.println(w + o + " " + months[x-1] + ", " + q1);//printing the date in full
                                    break;
                                    case 'b':
                                    int h=0, r=0;
                                    if(q<cy)//checking if the entered year is less than the current year
                                    {
                                        h = days[x-1]-w;
                                        x+=1;
                                        for(int s = x; s<13; s+=1)
                                            r = r + days[s-1];
                                        q+=1;
                                        while(q<cy)
                                        {
                                            if(((q%4)==0)&&((q%100!=0)||((q%400)==0)))
                                                days[1]=29;
                                            else
                                                days[1]=28;
                                            for (int s1 = 0; s1<12; s1+=1)
                                                r = r + days[s1];
                                            q+=1;
                                        }
                                        if (q==cy)
                                        {
                                            if (((cy%4)==0)&&((cy%100!=0)||((cy%400)==0)))
                                                days[1] = 29;
                                            else
                                                days[1] = 28;
                                            for (int f2=0; f2<cm-1; f2+=1)
                                                r = r + days[f2];
                                            r = r + cd;
                                        }
                                    }
                                    else if (q==cy)//checking if the entered year is equal to the current year
                                    {
                                        if(x<cm)//checking if the entered month is less than the current month
                                        {
                                            h = days[x-1]-w;
                                            for(int a = x; a<cm-1;a+=1)
                                                r = r+days[a];
                                            r = r +cd;
                                        }
                                        if(x==cm)//checking if the entered month is equal to the current month
                                        {
                                            if(w<cd)//checking if the entered date is less than the current date
                                                h=cd-w;
                                            if(w>cd)//checking if the entered date is greater than the current date
                                                h=w-cd;
                                        }
                                        if(x>cm)//checking if the entered month is greater than the current month
                                        {
                                            h=days[cm-1]-cd;
                                            cm+=1;
                                            if(x==cm)
                                                r=r+w;
                                            if(x>cm)
                                            {
                                                for(int b=cm;b<x;b+=1)
                                                    r=r+days[b-1];
                                                r=r+w;
                                            }
                                        }
                                    }
                                    else if(q>cy)//checking if the entered year is greater than the current year
                                    {
                                        h = days[cm-1]-cd;
                                        cm+=1;
                                        for(int z=cm; z<13; z+=1)
                                            r = r + days[z-1];
                                        cy+=1;
                                        while(cy<q)
                                        {
                                            if (((cy%4)==0)&&((cy%100!=0)||((cy%400)==0)))
                                                days[1] = 29;
                                            else
                                                days[1] = 28;
                                            for(int e = 0; e<12; e+=1)
                                                r = r + days[e];
                                            cy +=1;
                                        }
                                        if (cy==q)
                                        {
                                            if (((cy%4)==0)&&((cy%100!=0)||((cy%400)==0)))
                                                days[1] = 29;
                                            else
                                                days[1] = 28;
                                            for(int f = 0; f<x-1; f+=1)
                                                r = r+days[f];
                                            r = r + w;
                                        }
                                    }
                                    int total = h + r;
                                    System.out.println(total + " days");//displaying the number of days between the input date and the current date
                                    break;
                                    case 'c':
                                    days[1] = (((q1%4)==0)&&((q1%100!=0)||((q1%400)==0))) ? 29 : 28;
                                    int sum = 0, sum1;
                                    for(int t = 0; t<(x-1); t+=1)
                                    {
                                        sum = sum + days[t];
                                    }
                                    sum1 = sum + w;
                                    if ((sum1%10)==1)
                                        o1 = "st";
                                    else if ((sum1%10)==2)
                                        o1 = "nd";
                                    else if ((sum1%10)==3)
                                        o1 = "rd";
                                    else
                                        o1 = "th";
                                    System.out.println("This is the " + sum1 + o1 + " day of the year.");
                                    break;
                                    case 'd':
                                    System.out.println("Enter the number of days.");
                                    int N = sc.nextInt();
                                    int N1 = N, N2 = N;                                   
                                    int w1 = w, x1 = x, q2 = q, adddays = 0;
                                    if (N<=(days[x1-1]-w1))
                                    {
                                        w1 = w + N;
                                        System.out.println("Future date after " + N + " days: " + w1 + "/" + x1 + "/" + q2); 
                                    }
                                    else
                                    {
                                        while (N>(days[x1-1]-w1))
                                        {
                                            adddays = days[x1-1] - w1;
                                            w1 = 0;
                                            N = N - adddays;
                                            if (x1<12)
                                                x1 = x1 + 1;
                                            else
                                            {
                                                x1 = 1;
                                                q2 = q2 + 1;
                                                if (((q2%4)==0)&&((q2%100!=0)||((q2%400)==0)))//checking if it is a leap year
                                                    days[1] = 29;
                                                else
                                                    days[1] = 28;
                                            }
                                        }
                                        w1 = N;
                                        System.out.println("Future date after " + N1 + " days: " + w1 + "/" + x1 + "/" + q2);
                                    }
                                    System.out.println("Enter the day of the week on 1st January, " + q2);
                                    String canned = sc.nextLine();
                                    String weekday = sc.nextLine();
                                    String week_days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
                                    String futurewd;
                                    boolean checkday = false;
                                    int Nday = 0;
                                    for (int loop = 0; loop<7; loop+=1)
                                    {
                                        if (weekday.equalsIgnoreCase(week_days[loop])==true)
                                        {
                                            checkday = true;
                                            Nday = loop;
                                            break;
                                        }
                                    }
                                    if (checkday==false)
                                        System.out.println("Invalid Input of Week Day !!!!");
                                    if (checkday==true)
                                    {
                                        days[1] = (((q2%4)==0)&&((q2%100!=0)||((q2%400)==0))) ? 29 : 28;
                                        int sum2 = 0, sum3;
                                        for(int t1 = 0; t1<(x1-1); t1+=1)
                                        {
                                            sum2 = sum2 + days[t1];
                                        }
                                        sum3 = sum2 + w1;//sum3 stores the corresponding day of the year
                                        System.out.println("Day Number = " + sum3);
                                        sum3 = sum3%7;
                                        if ((sum3 + Nday - 1)<7)
                                            futurewd = week_days[((sum3 + Nday)-1)];
                                        else
                                            futurewd = week_days[((sum3 + Nday)-8)];
                                        System.out.println("Day of the Week on " + w1 + "/" + x1 + "/" + q2 + " is " + futurewd);
                                    }
                                }
                                System.out.println();
                                System.out.println("Do you wish to choose again? : Y/N");
                                dum = (char)System.in.read();
                                ansr = (char)System.in.read();//accepting the user's choice
                            } 
                            while ((ansr =='Y')||(ansr =='y'));
                        }
                        else if (x>12)//checking if the entered month is greater than 12
                            System.out.println("INVALID DATE.Please enter the correct month.");
                        else if (w>days[x-1])//checking if the entered day exceeds the total number of days in the respective month
                            System.out.println("INVALID DATE.Please enter the correct day.");
                    }
                    else
                        System.out.println("INVALID DATE");
                    System.out.println("Do you wish to check date validity again? : Y/N");
                    dum1 = (char)System.in.read();
                    ans = (char)System.in.read();//accepting the user's choice
                }
                while((ans=='Y')||(ans=='y'));
            }
            else
                continue;
        }
        if (chk==false)
            System.out.println("Wrong username or password");
    }
}