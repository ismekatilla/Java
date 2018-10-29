package collections;

public class Ogretmen implements Comparable<Ogretmen> {

	private Integer id;
	private String adi;

	public Ogretmen(Integer id, String adi) {
		this.id = id;
		this.adi = adi;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return adi;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Ogretmen ogretmen = (Ogretmen) obj;
		return ogretmen.id.equals(id);
	}

	@Override
	public int compareTo(Ogretmen o) {
		// TODO Auto-generated method stub
		return id.compareTo(o.getId());
	}
}