class Anime extends Entity {
	public Anime(Object data) {
		super(data);
	}

	public void Genre(Object data) {
		System.out.println(data);
	}
}

class Digimon extends Entity {
	public Digimon(Object data) {
		super(data);
	}

	public void Aksi(Object data) {
		System.out.println(data);
	}
}

public class MainNode {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Anime aku = new Anime("Digimon");

		Digimon kau = new Digimon("Omnimon");

		list.insert(new Anime("Kakkoi"));
		list.insert(new Digimon("Fly"));
		list.insert(new Anime("Kawaii"));
		list.insert(new Digimon("Roar"));
		list.deleteTail();

		System.out.println("Linked list: ");
		list.display();
		aku.Genre("Tanoshii");
		kau.Aksi("Blast");

	}
}
