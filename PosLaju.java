package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int c = 0;
        double zone=0, weight = 0, type =0, domestic, surcharge, charge = 0, sum = 0;
        char town;

        System.out.printf("%50s" , "Welcome to Pos Laju");
        System.out.println("\n************************************************************************************");

        System.out.print("\nHow many time you want to use : ");
        int size = sc.nextInt();
        int[] choice = new int[size];

        System.out.print("\n-> Enter 1 - Next Day Delivary" + "\n-> Enter 2 - Same Day Delivary");
        System.out.println("\n-> Enter 3 - Prepaid Box and Envelope" + "\n-> Enter 4 - Pos Ekpress");

        while (i < choice.length && choice[i] != -1) {

            System.out.print("\n\nPlease enter choice : ");
            choice[i] = sc.nextInt();
            if (choice[i] < 1 && choice[i] > 4) {
                System.out.println("Invalid choice");
            }
            if (choice[i] == -1) {
                System.out.print("Ooppss You have pushed stop button");
                charge = 0;
            }

            if (choice[i] == 1) {
                System.out.print("Please enter zone : ");
                zone = sc.nextDouble();

                if (zone == 1) {
                    System.out.print("Please enter weight in gram : ");
                    weight = sc.nextInt();
                    if (weight <= 500 && weight <= 2000) {
                        charge = 4.90;
                    } else if (weight > 500 && weight <= 2000) {
                        charge = 4.90 + 0.8 * ((weight - 500) / 250);
                    } else if (weight > 2000 && weight <= 2500) {
                        charge = 10.50;
                    } else if (weight > 2500) {
                        charge = 10.50 + 0.50 * ((weight - 2500) / 500);
                    }
                }
                else if (zone == 2) {
                    System.out.print("Please enter weight in gram : ");
                    weight = sc.nextInt();
                    if (weight <= 500 && weight <= 2000) {
                        charge = 5.40;
                    } else if (weight > 500 && weight <= 2000) {
                        charge = 5.40 + 1.00 * ((weight - 500) / 250);
                    } else if (weight > 2000 && weight <= 2500) {
                        charge = 16.00;
                    } else if (weight > 2500) {
                        charge = 16.00 + 2.00 * ((weight - 2500) / 500);
                    }
                }
                else if (zone == 3) {
                    System.out.print("Please enter weight in gram : ");
                    weight = sc.nextInt();
                    if (weight <= 500 && weight <= 2000) {
                        charge = 6.90;
                    } else if (weight > 500 && weight <= 2000) {
                        charge = 6.90 + 1.50 * ((weight - 500) / 250);
                    } else if (weight > 2000 && weight <= 2500) {
                        charge = 21.00;
                    } else if (weight > 2500) {
                        charge = 21.00 + 3.00 * ((weight - 2500) / 500);
                    }
                }
                else if (zone == 4) {
                    System.out.print("Please enter weight : ");
                    weight = sc.nextInt();
                    if (weight <= 500 && weight <= 2000) {
                        charge = 7.40;
                    } else if (weight > 500 && weight <= 2000) {
                        charge = 7.40 + 1.50 * ((weight - 500) / 250);
                    } else if (weight > 2000 && weight <= 2500) {
                        charge = 26.00;
                    } else if (weight > 2500) {
                        charge = (26.00 + 3.50 * ((weight - 2500) / 500));
                    }
                }
                else if (zone == 5) {
                    System.out.print("Please enter weight in gram : ");
                    weight = sc.nextInt();
                    if (weight <= 500 && weight <= 2000) {
                        charge = 7.90;
                    } else if (weight > 500 && weight <= 2000) {
                        charge = 7.90 + 2.00 * ((weight - 500) / 250);
                    } else if (weight > 2000 && weight <= 2500) {
                        charge = 31.00;
                    } else if (weight > 2500) {
                        charge = 31.00 + 4.00 * ((weight - 2500) / 500);
                    }
                }
                else {
                    System.out.println("\nInvalid zone");

                }
                System.out.printf("\n%10s%15s%15s" , "Zone" , "Weight(g)" , "Charge(RM)");
                System.out.printf("\n%8.0f%13.0f%16.2f" , zone , weight , charge);
            }
            if(choice[i]==2){
                System.out.println("> Enter a for local town");
                System.out.println("> Enter b for cross town");
                System.out.print("Please enter your town : ");
                town = sc.next().charAt(0);
                System.out.print("Please enter the weight in gram : ");
                weight = sc.nextDouble();

                if(town == 'a'){
                    if (weight<500)
                    {
                        domestic=4.90;
                        surcharge=6.00;
                        charge = domestic + surcharge;
                    }
                    else if (weight >= 500 && weight < 750 ) {
                        domestic=5.70;
                        surcharge=6.00;
                        charge = domestic + surcharge;
                    }
                    else if (weight >= 750 && weight <= 1000) {
                        domestic=6.50;
                        surcharge=6.00;
                        charge = domestic + surcharge;
                    }

                }
                    else if(town == 'b'){
                        if (weight <= 500) {
                            domestic=5.40;
                            surcharge=7.50;
                            charge =domestic + surcharge;
                        }

                        else if (weight > 500 && weight <= 750 ) {
                            domestic=6.40;
                            surcharge=7.50;
                            charge = domestic + surcharge;
                        }

                        else if (weight > 750 && weight <= 1000) {
                            domestic=7.40;
                            surcharge=7.50;
                            charge = domestic + surcharge;
                        }

                    }
                    else {
                    System.out.print("Invalid");
                    charge = 0.00;
                }
                    System.out.printf("\n%10s%15s%15s" , "Town" , "Weight(g)" , "Charge(RM)");
                    System.out.printf("\n%8s%15.0f%15.2f" , town , weight , charge);

                }

            if(choice[i]==3){
            System.out.println("> Enter 1 for Envelope S" + "\n> Enter 2 for Envelope L");
            System.out.println("> Enter 3 for Prepaid Box S" + "\n> Enter 4 for Prepaid Box M");
            System.out.println("> Enter 5 for Prepaid box L");


            System.out.print("\nPlease enter type of package : ");
            type = sc.nextInt();
            System.out.print("Please enter weight in gram : ");
            weight = sc.nextDouble();

                if (type == 1) {
                    if (weight == 500) {
                    charge = 7.31; }
                }
                else if (type == 2) {
                    if (weight == 1000) {
                    charge = 10.49;
                    }
                }
                else if (type == 3) {
                    if (weight == 2000) {
                    charge = 13.78;
                    }
                }
                else if (type == 4) {
                    if (weight == 5000) {
                    charge = 21.20;
                    }
                }
                else if (type == 5) {
                    if (weight == 10000) {
                     charge = 31.80;
                    }
                }
                else {
                    System.out.print("Invalid");
                    charge = 0;
                }
                System.out.printf("\n%10s%15s%15s" , "Type" , "Weight(g)" , "Charge(RM)");
                System.out.printf("\n%8.0f%13.0f%15.2f" , type , weight , charge);
            }
            if (choice[i] == 4) {
                System.out.print("> Enter 1 for LG" + "\n> Enter 2 for LE(CS)");
                System.out.println("\n> Enter 3 for LD(B4)" + "\n> Enter 4 for LK");

                System.out.print("\nPlease enter type of document : ");
                type = sc.nextDouble();
                System.out.print("Please enter weight in gram : ");
                weight = sc.nextDouble();

                if (type == 1 && weight == 100) {
                    charge = 3.18;
                }
                else if (type == 2 && weight == 250) {
                    charge = 3.71;
                }
                else if (type == 3 && weight == 500) {
                    charge = 4.77;
                }
                else if (type == 4 && weight == 1000) {
                    charge = 7.42;
                }
                else {
                    System.out.print("Invalid");
                }
                    System.out.printf("\n" + "%10s%15s%15s", "Type", "Weight(g)", "charge(RM)");
                    System.out.printf("\n%8.0f%12.0f%16.2f", type, weight, charge);
            }

                c = c + choice[i];
                sum = sum + charge;
                i = i + 1;

        }

            System.out.print("\n\nTotal Charge : RM " + sum);
            System.out.println("\n\n**********************************************************************************");
            System.out.printf("%50s" , " Thank You ^-^ ");
    }

}



