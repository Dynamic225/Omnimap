package main;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConceptNode implements Comparable<ConceptNode> {
    String conceptText;
    ConceptNode parent = null;
    SortedSet<ConceptNode> related;

    public ConceptNode(String conceptText, SortedSet<ConceptNode> related) {
        this.conceptText = conceptText;
        this.related = new TreeSet<ConceptNode>();
    }

    @Override
    public int compareTo(ConceptNode otherNode) {
        return this.conceptText.compareTo(otherNode.conceptText);
    }
}
