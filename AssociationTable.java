import java.util.Set;
import java.util.TreeMap;

public class AssociationTable<K extends Comparable<K>,V> {
	
	private TreeMap<K,V> asscoTable;
	
	public AssociationTable() {
		asscoTable = new TreeMap<>();
	}
	
	public AssociationTable(K[] keys,V[] values) throws IllegalArgumentException {
		asscoTable = new TreeMap<>();
		
		if(keys.length != values.length) {
			throw new IllegalArgumentException("The length of the arguments is not equal.");
		}
		else {
			for(int i = 0; i < keys.length; i++) {
				asscoTable.put(keys[i],values[i]);
			}
		}
	}
	
	public void add(K key, V value) {
		asscoTable.put(key, value);
	}
	
	public V get(K key) {
		return asscoTable.get(key);
	}
	
	public boolean contains(K key) {
		return asscoTable.containsKey(key);
	}
	
	public boolean remove(K key) {
		return asscoTable.remove(key)!=null;
	}
	
	public int size() {
		return asscoTable.size();
	}
	
	public Set<K> keyIterator() {
		return asscoTable.keySet();
	}
}