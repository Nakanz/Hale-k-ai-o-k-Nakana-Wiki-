package shop.data;

/**
 * Implementation of Video interface.
 * @see Data
 */
final class VideoObj implements Video {
  private final String _title;
  private final int    _year;
  private final String _director;

  /**
   * Initialize all object attributes.
   * Title and director are "trimmed" to remove leading and final space.
   * @throws IllegalArgumentException if object invariant violated.
   */
  VideoObj(String title, int year, String director) {
	  if (title == null 
			  || director == null
			  || year >= 5000 
			  || year <= 1800) {
		  throw new IllegalArgumentException();
	  }
	  title = title.trim(); director = director.trim();
	  if (title.equals("") || director.equals("")) {
		  throw new IllegalArgumentException();
	  }
    
	_title = title;
    _director = director;
    _year = year;
  }

  public String director() {
    // TODO  
    return _director;
  }

  public String title() {
    // TODO  
    return _title;
  }

  public int year() {
    // TODO  
    return _year;
  }

  public boolean equals(Object thatObject) {
    // TODO  
	if (this == thatObject) {
		return true;
	}
	// is thatObject a VideoObj? 
	if (thatObject instanceof VideoObj) {
		String thatTitle = ((VideoObj) thatObject)._title;
		int thatYear = ((VideoObj) thatObject)._year;
		String thatDirector = ((VideoObj) thatObject)._director;
		if (thatTitle.equals(this._title)) {
			if (thatYear == this._year) {
				if (thatDirector.equals(this._director)) {
					return true;
				}
			}
		}
				
	 }
		return false;
  }

  public int hashCode() {
	int result = 17;
	result = 37 * result + this._title.hashCode();
	result = 37 * result + this._year;
	result = 37 * result + this._director.hashCode();
	return result;
  }

  public int compareTo(Object thatObject) {
	  if (thatObject == null) {
			throw new NullPointerException();
		}
		if (thatObject instanceof VideoObj) {
			VideoObj vCast = (VideoObj) thatObject;
			int titleDiff = _title.compareTo(vCast._title);
			if (titleDiff != 0) {
				return titleDiff;
			}
			int yearDiff = _year - vCast._year;
			if (yearDiff != 0) {
				return yearDiff;
			}
			int directorDiff = _director.compareTo(vCast._director);
			if (directorDiff != 0) {
				return directorDiff;
			}
			return 0;  
		}
		throw new IllegalArgumentException();
  }

  public String toString() {
    // TODO  
	return this._title + " (" + this._year + ") : " + this._director;
  }
}
