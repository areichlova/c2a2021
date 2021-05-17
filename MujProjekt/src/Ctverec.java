
public class Ctverec implements Comparable<Ctverec>{
	private int strana;

	public Ctverec(int strana) {
		super();
		this.strana = strana;
	}

	public int getStrana() {
		return strana;
	}

	public void setStrana(int strana) {
		this.strana = strana;
	}

	@Override
	public String toString() {
		return "Ctverec [strana=" + strana + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + strana;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ctverec other = (Ctverec) obj;
		if (strana != other.strana)
			return false;
		return true;
	}

	@Override
	public int compareTo(Ctverec o) {
		return this.strana - o.strana;
	}

}
