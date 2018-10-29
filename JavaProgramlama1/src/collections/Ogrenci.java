package collections;

public class Ogrenci implements Comparable<Ogrenci>{

	private Integer id;
	private String ad;

	public Ogrenci(Integer id, String ad) {
		this.id = id;
		this.ad = ad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Ogrenci) obj).getId().equals(id) && ((Ogrenci) obj).getAd().equals(ad);
	}
	
	@Override
	public int hashCode() {
	    return id;
	}

	@Override
	public int compareTo(Ogrenci o) {
		// TODO Auto-generated method stub
		return id.compareTo(o.getId());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ad;
	}
}