package qwikflix

class Quote {
	
	String content
	String author
	Date created = new Date()

    static constraints = {
		
		author(blank:false)
		content(maxsize:1000,blank:false)
    }
	
	
}
