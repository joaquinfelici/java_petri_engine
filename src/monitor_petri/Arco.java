package monitor_petri;

public class Arco {
	
	private String id;
	private String id_source;
	private String id_target;
	private Integer weight;
	
	public Arco(String _id, String _id_source, String _id_target, Integer _weight){
		this.id = _id;
		this.id_source = _id_source;
		this.id_target = _id_target;
		this.setWeight(_weight);
	}

	/**
	 * @return the arc's weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight the arc's weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}