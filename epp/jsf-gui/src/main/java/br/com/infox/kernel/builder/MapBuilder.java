package br.com.infox.kernel.builder;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder<K, V> {
	private Map<K, V> map = new HashMap<>();
	
	public static <K, V> MapBuilder<K, V> create() {
		return new MapBuilder<K, V>();
	}
	
	public MapBuilder<K, V> put(K key, V value) {
		map.put(key, value);
		return this;
	}
	
	public Map<K, V> build() {
		return map;
	}
}
