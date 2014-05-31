package nationalcivicday

class CycleInfo {

	String incidentType
	Date dates
	Float LOCX
	Float LOCY
	String Describe
	
	static mapping = {
		version false
		//id false
		//id generator:'assigned', column:'Student_id', type:'integer'
		id name: 'id'
	}
	
    static constraints = {
    }
}
