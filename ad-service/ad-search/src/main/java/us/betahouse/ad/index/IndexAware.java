package us.betahouse.ad.index;

/**
 * 索引接口 用于感知
 *
 * @param <K> key
 * @param <V> value
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
