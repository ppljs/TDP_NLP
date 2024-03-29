
import java.util.*;

public class WordContainer implements Comparable{

	private String _fullWord = "";
	private String _reducedWord = "";
	private String _synset = "";
	private String _hexColor = "#000000";
	private String _verb = "";
	private String _natureOfEntity = "";
	private String _stage = "NA";

 	public WordContainer() {

 	}

	public WordContainer(String fullWord, String reducedWord, String synset, String verb, String natureOfEntity) {
		_fullWord = fullWord;
		_reducedWord = reducedWord;
		_synset = synset;
		_verb = verb;
		_natureOfEntity = natureOfEntity;
	}

	public WordContainer(WordContainer wc) {
		_fullWord = wc.getFullWord();
		_reducedWord = wc.getReducedWord();
		_synset = wc.getSynset();
		_hexColor = wc.getHexColor();
		_verb = wc.getVerb();
		_natureOfEntity = wc.getNatureOfEntity();
		_stage = wc.getStage();
	}

	public int compareTo(Object wdContainer) throws ClassCastException {
		if (!(wdContainer instanceof WordContainer))
      		throw new ClassCastException("A WordContainer object expected.");
    	String wdContainerSynset = ((WordContainer) wdContainer).getSynset();  
    	return (_synset.equals(wdContainerSynset))? 1 : 0;
	}

	public String getFullWord() {
		return _fullWord;
	}

	public String getReducedWord() {
		return _reducedWord;
	}

	public String getSynset() {
		return _synset;
	}

	public String getHexColor() {
		return _hexColor;
	}

	public String getVerb() {
		return _verb;
	}

	public String getNatureOfEntity() {
		return _natureOfEntity;
	}

	public String getStage() {
		return _stage;
	}

	public void setFullWord(String fullWord) {
		_fullWord = fullWord;
	}

	public void setReducedWord(String reducedWord) {
		_reducedWord = reducedWord;
	}

	public void setSynset(String synset) {
		_synset = synset;
	}

	public void setHexColor(String hexColor) {
		_hexColor = hexColor;
	}

	public void setVerb(String verb) {
		_verb = verb;
	}

	public void setNatureOfEntity(String natureOfEntity) {
		_natureOfEntity = natureOfEntity;
	}

	public void setStage(String stage) {
		_stage = stage;
	} 
}
