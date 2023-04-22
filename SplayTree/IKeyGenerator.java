/**
 * @author moises.alonso
 *
 */
public interface IKeyGenerator<K, T> {

	K getKey(T value);
	
}
