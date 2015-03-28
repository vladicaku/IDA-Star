import java.awt.List;
import java.util.LinkedList;

public class Tester2 {
	public static void main(String[] args) {
		// Nodes //
		Node skopje = new Node("Skopje", 1070);
		
		Node london = new Node("London", 1130);
		Node vienna = new Node("Vienna", 1090);
		Node belgrade = new Node("Belgrade", 1074);
		
		Node orlando = new Node("Orland", 786);
		Node losAngeles = new Node("Los Angeles", 647);
		Node mexico = new Node("Mexico City", 663);
		
		Node rome = new Node("Rome", 1112);
		Node tokyo = new Node("Tokyo", 557);
		Node bangkok = new Node("Bangkok", 581);
		
		Node dubai = new Node("Dubai", 853);
		Node abuDhabi = new Node("Abu Dhabi", 854);
		Node zagreb = new Node("Zagreb", 1094);
		
		Node atlanta = new Node("Atlanta", 790);
		Node panama = new Node("Panama", 708);
		Node dallas = new Node("Dallas", 729);
		
		Node chicago = new Node("Chicago", 803);
		Node brisbane = new Node("Brisbane", 150);
		Node losAngeles_Auckland = new Node("Auckland", 33);  //NEW
		Node tokyo_Auckland = new Node("Auckland", 33);  //NEW
		
		Node miami = new Node("Miami", 780);
		Node quito = new Node("Quito", 687);
		Node lima = new Node("Lima", 636);
		
		Node madrid = new Node("Madrid", 1190);
		Node barcelona = new Node("Barcelona", 1163);
		Node malta = new Node("Malta", 1090);
		
		Node seoul = new Node("London", 596);
		//Node auckland = new Node("London", 1130);
		Node hongKong = new Node("Hong Kong", 5630);
		
		Node kolkata = new Node("Kolkata", 678);
		Node melburne = new Node("Melburne", 155);
		Node singapore = new Node("Singapore", 510);
		
		Node moskow = new Node("Moskow", 923);
		Node islamabad = new Node("Islamabad", 794);
		Node dubai_Sydnay = new Node("Sydnay", 135);  //NEW
		Node abuDhabi_Sydnay = new Node("Sydnay", 135);   //NEW
		
		Node nairobi = new Node("Nairobi", 822);
		//Node sydnay = new Node("London", 1130);
		Node mumbai = new Node("Mumbai", 741);
		
		Node paris = new Node("Paris", 1140);
		Node amsterdam = new Node("Amsterdam", 1114);
		Node frankfurt = new Node("Frankfurt", 1113);
		
		Node charlotte = new Node("Charlotte", 813);
		Node lawton = new Node("Lawton", 730);
		Node caracas = new Node("Caracas", 786);
		
		Node minneapolis = new Node("Minneapolis", 790);
		Node wellington = new Node("Wellington", 0);
		Node cairns= new Node("Cairns", 236);
		Node hobart = new Node("Hobart", 136);
		Node adelaide = new Node("Adelaide", 193);
		Node portVila = new Node("Port Vila", 164);
		
		Node portOfSpain = new Node("Port of Spain", 812);
		Node baltraIsland= new Node("Baltra Island", 625);
		Node buienosAires= new Node("Buienos Aires", 603);
		
		Node casablanca = new Node("Casablanca", 1146);
		Node bondeauh = new Node("Bondeuah", 1170);
		Node cirih = new Node("Cirih", 1124);
		
		//
		//
		//
		
		Node aliceSprings = new Node("Alice Springs", 257);
		Node kingIsland = new Node("King Island", 157);
		//Node wellington= new Node("London", 1130);
		
		Node darwin = new Node("Darwin", 320);
		Node perth = new Node("Perth", 318);
		//Node wellington = new Node("London", 1130);
		
		//
		//
		//
		
		Node berlin = new Node("Berline", 1089);
		Node manchester = new Node("Manchester", 1120);
		Node nuremberg = new Node("Nuremberg", 1107);
		

		// Edges //
		skopje.addEdge(london, 200);
		skopje.addEdge(vienna, 100);
		skopje.addEdge(belgrade, 70);
		
		london.addEdge(orlando, 550);
		london.addEdge(losAngeles, 680);
		london.addEdge(mexico, 680);
		
		vienna.addEdge(rome, 100);
		vienna.addEdge(tokyo, 670);
		vienna.addEdge(bangkok, 625);
		
		belgrade.addEdge(dubai, 310);
		belgrade.addEdge(abuDhabi, 305);
		belgrade.addEdge(zagreb, 55);
		
		orlando.addEdge(atlanta, 90);
		orlando.addEdge(dallas, 170);
		orlando.addEdge(panama, 205);
		
		losAngeles.addEdge(chicago, 240);
		losAngeles.addEdge(brisbane, 840);
		losAngeles.addEdge(losAngeles_Auckland, 780);
		
		mexico.addEdge(miami, 180);
		mexico.addEdge(quito, 280);
		mexico.addEdge(lima, 350);
		
		rome.addEdge(madrid, 150);
		rome.addEdge(barcelona, 105);
		rome.addEdge(malta, 85);
		
		tokyo.addEdge(seoul, 150);
		tokyo.addEdge(tokyo_Auckland, 650);
		tokyo.addEdge(hongKong, 270);
		
		bangkok.addEdge(kolkata, 165);
		bangkok.addEdge(melburne, 530);
		bangkok.addEdge(singapore, 145);
		
		dubai.addEdge(moskow, 340);
		dubai.addEdge(islamabad, 190);
		dubai.addEdge(dubai_Sydnay, 820);
		
		abuDhabi.addEdge(nairobi, 305);
		abuDhabi.addEdge(abuDhabi_Sydnay, 845);
		abuDhabi.addEdge(mumbai, 741);
		
		zagreb.addEdge(paris, 120);
		zagreb.addEdge(amsterdam, 125);
		zagreb.addEdge(frankfurt, 110);
		
		atlanta.addEdge(charlotte, 67);
		dallas.addEdge(lawton, 60);
		panama.addEdge(caracas, 120);
		
		chicago.addEdge(minneapolis, 85);
		brisbane.addEdge(wellington, 325);  //old 205
		brisbane.addEdge(cairns, 145);
		brisbane.addEdge(hobart, 170);
		// NEW ============== //
		losAngeles_Auckland.addEdge(wellington, 185);
		losAngeles_Auckland.addEdge(adelaide, 420);
		losAngeles_Auckland.addEdge(portVila, 195);
		tokyo_Auckland.addEdge(wellington, 665);
		tokyo_Auckland.addEdge(adelaide, 420);
		tokyo_Auckland.addEdge(portVila, 195);
		// NEW ============== //
		
		miami.addEdge(portOfSpain, 225);
		quito.addEdge(baltraIsland, 130);
		lima.addEdge(buienosAires, 245);
		
		madrid.addEdge(casablanca, 120);
		barcelona.addEdge(bondeauh, 75);
		malta.addEdge(cirih, 140);
		
		melburne.addEdge(aliceSprings, 170);
		melburne.addEdge(kingIsland, 55);
		melburne.addEdge(wellington, 200);
		
		// NEW ============== //
		dubai_Sydnay.addEdge(darwin, 275);
		dubai_Sydnay.addEdge(perth, 300);
		dubai_Sydnay.addEdge(wellington, 240);
		abuDhabi_Sydnay.addEdge(darwin, 275);
		abuDhabi_Sydnay.addEdge(perth, 300);
		abuDhabi_Sydnay.addEdge(wellington, 195);
		// NEW ============== //
		
		paris.addEdge(barcelona, 90);
		amsterdam.addEdge(manchester, 95);
		frankfurt.addEdge(nuremberg, 40);
		
		IDAStar.IDAStar(skopje);
		
	}
}

