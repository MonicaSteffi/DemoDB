package demo

class Demodb {
	String mirId
	String types
	String regulation
	String pubmed

    static constraints = {
	mirId()
	types()
	regulation()
	pubmed()
    }
	
	static mapping={
	table 'details'
	version false
	
	mirId column: 'mirId';
	types column: 'Types';
	regulation column: 'Regulation';
	pubmed column: 'Pubmed';
	
	}
}
