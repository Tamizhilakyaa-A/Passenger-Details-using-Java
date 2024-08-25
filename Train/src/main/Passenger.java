package main;

//initialized a 2D passenger array with passenger objects, fined the passengers without ticket and finally printed the total fined amount

public class Passenger extends Train {

	int pid;
	String pname;
	boolean is_ticket_present;

	public Passenger(int pid, String pname, boolean is_ticket_present) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.is_ticket_present = is_ticket_present;
	}

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", pname=" + pname + ", is_ticket_present=" + is_ticket_present + "]";
	}

	public static void main(String[] args) {

		Train[][] marinaExpress = { { new Passenger(1, "Vimal", false) }, { new Passenger(2, "Sakthi", false) },
				{ new Passenger(3, "Charu", true) }, { new Passenger(4, "Rithesh", true) },
				{ new Passenger(5, "Mala", false) } };
		double fine = 250, total_fine = 0;

		for (int i = 0; i < marinaExpress.length; i++) {
			for (int j = 0; j < marinaExpress[i].length; j++) {
				Passenger p = (Passenger) marinaExpress[i][j];
				if (p.is_ticket_present == false) {
					System.out.println("Passenger without ticket :" + p.pname);
					total_fine += fine;
				}

			}

		}
		System.out.println("The total fine collected from passengers without ticket is rupees " + total_fine);
	}
}
