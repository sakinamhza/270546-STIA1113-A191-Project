# 270546-STIA1113-A191-Project

NAME : JULINEY A/P SEN  MATRIC NUMBER : 272828

NAME : SHARIFAH NURSAKINA EMALIN BT SYED MAHAZA  MATRIC NUMBER : 270546

NAME : NUR HASLINDA BINTI ABDUL HASSAN  MATRIC NUMBER : 271551

NAME : SITI NORSUHADA BINTI IBRAHIM  MATRIC NUMBER : 271395

#INTRODUCTION

In this project we must create a coding about Pos Laju Ekspress. In our coding we also  use selection, looping, array. In this project there is 4 part which is Next day delivery , Same day delivery, Prepaid box and Envelope , Pos Ekspress.

#PSEUDOCODE

Start 
Declare 
int i=0,
int c=0,
double zone=0, weight = 0, type =0, domestic, surcharge, charge = 0, sum = 0
char town
Display "Welcome to Pos Laju"
Display "how many time you want to use" 
Input int size  
int [] choice = new int [size]
Display Menu  
While (i < choice.length && choice[i] != -1)
	Display "Please enter choice"
	Input choice[i]
 	if (choice[i] < 1 && choice[i] > 4) 
		Display "Invalid choice"
	
	if (choice[i] == -1) 
		Display "Ooppss you have pushed stop button"

	if (choice[i] == 1)
		Display "Please enter zone"
		zone = sc.nextDouble()
		if (zone == 1) 
		Display "Please enter weight in gram"
		weight = sc.nextInt()
			if (weight <= 500 && weight <= 2000) 
			charge = 4.90 
			else if (weight > 500 && weight <= 			2000) 

                	charge = 4.90 + 0.8 * ((weight - 500) 			/ 250)
                	else if (weight > 2000 && weight <= 			2500) 
                	charge = 10.50
                	else if (weight > 2500) 
                	charge = 10.50 + 0.50 * ((weight -			2500)/ 500)
	
	else if (zone == 2) 
		Display "Please enter weight in gram"
		weight = sc.nextInt()
		if (weight <= 500 && weight <= 2000) 
		charge = 5.40
			else if (weight > 500 && weight <= 			2000)
			charge = 5.40 + 1.00 * ((weight - 500) 			/ 250)
			else if (weight > 2000 && weight <= 			2500) 
                        charge = 16.00
			else if (weight > 2500) 
                        charge = 16.00 + 2.00 * ((weight - 			2500) / 500)
			
	else if (zone == 3) 
		Display "Please enter weight in gram"
		weight = sc.nextInt()
		if (weight <= 500 && weight <= 2000) 
                charge = 6.90;
                	else if (weight > 500 && weight <= 			2000) 
                        charge = 6.90 + 1.50 * ((weight - 500) 			/ 250)
                    	else if (weight > 2000 && weight <= 			2500)
                    	charge = 21.00
                    	else if (weight > 2500) 
                        charge = 21.00 + 3.00 * ((weight - 			2500) / 500)
	else if (zone == 4) 
                    Display"Please enter weight"
                    weight = sc.nextInt()
                    if (weight <= 500 && weight <= 2000) 
                    charge = 7.40
                    	else if (weight > 500 && weight <= 			2000) 
                        charge = 7.40 + 1.50 * ((weight - 500) 			/ 250)
                    	else if (weight > 2000 && weight <= 			2500)
                        charge = 26.00
                    	else if (weight > 2500) 
                        charge = (26.00 + 3.50 * ((weight - 			2500) / 500))

	else if (zone == 5)
                    Display"Please enter weight in gram"
                    weight = sc.nextInt()
                    if (weight <= 500 && weight <= 2000) 
                    charge = 7.90
                    	else if (weight > 500 && weight <= 			2000)
                        charge = 7.90 + 2.00 * ((weight - 500) 			/ 250)
                    	else if (weight > 2000 && weight <= 			2500) 
                        charge = 31.00
                    	else if (weight > 2500) 
                        charge = 31.00 + 4.00 * ((weight - 			2500) / 500)
	else
		Display "Invalid zone"
	Display"Zone, Weight(g), RM"
	Display zone, weight, charge


if(choice[i]==2)
	Display "Enter a for local town"
	Display "Enter b for cross town"			Display"Please enter your town"	
	town = sc.next().charAt(0)
	Display "Please enter the weight in gram"
	weight = sc.nextDouble

if (town == 'a')
	if (weight<500)
		domestic=4.90
                surcharge=6.00
                charge = domestic + surcharge

	else if (weight >= 500 && weight < 750 ) 
		domestic=5.70
                surcharge=6.00
                charge = domestic + surcharge

	else if (weight >= 750 && weight <= 1000) 
                domestic=6.50
                surcharge=6.00
                charge = domestic + surcharge

	else if(town == 'b')
		if (weight <= 500) 
			domestic=5.40
                        surcharge=7.50
                        charge =domestic + surcharge

		else if (weight > 500 && weight <= 750 ) 
                            domestic=6.40
                            surcharge=7.50
                            charge = domestic + surcharge
		
		else if (weight > 750 && weight <= 1000) 
                            domestic=7.40
                            surcharge=7.50
                            charge = domestic + surcharge

	else 
		Display "Invalid"
		Display "Town, Weight(g), Charge(RM)"
		Display town, weight, charge

if(choice[i]==3)
Display Menu
Display "Please enter type of package"
type=sc.nextInt()
Display "Please enter weight in gram" 
weight=sc.nextDouble	
	if (type == 1) 
        	if (weight == 500) 
                charge = 7.31
	else if (type == 2) 
                if (weight == 1000) 
                charge = 10.49
	else if (type == 3) 
                if (weight == 2000) 
                charge = 13.78
	else if (type == 4) {
                if (weight == 5000) 
                charge = 21.20
	else if (type == 5) 
                if (weight == 10000) 
                charge = 31.80
	else 
		Display "Invalid"
	Display "Type, Weight(g), Charge(RM)"
	Display type, weight, charge 

if (choice[i] == 4) 
	Display Menu 
	Display "Please enter type of document"
	Display "Please enter weight in gram"

	if (type == 1 && weight == 100)
		charge = 3.18
		
	else if (type == 2 && weight == 250) 
		charge = 3.71
	
	else if (type == 3 && weight == 500) 
		charge = 4.77

	else if (type == 4 && weight == 1000) 
		charge = 7.42
	
	else
		Display "Invalid"
		Display "Type, Weight(g), Charge(RM)"
		Display type, weight, charge

	c = c + choice[i]
        sum = sum + charge
        i = i + 1

	Display "Total Charge : RM" + sum
	Display "Thank you ^-^"
