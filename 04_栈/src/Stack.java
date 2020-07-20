import com.cs.list.ArrayList;
import com.cs.list.List;

/**
 * 栈
 * @author chenshuang
 *
 * @param <E>
 */
public class Stack<E> {
	private List<E> list = new ArrayList<>();
	
	/// 元素的数量
	public int size() {
		return list.size();
	}
	
	/// 是否为空
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	/// 入栈
	public void push(E element) {
		list.add(element);
	}
	
	/// 出栈
	public E pop() {
		return list.remove(list.size() - 1);
	}
	
	/// 获取栈顶元素
	public E top() {
		return list.get(list.size() - 1);
	}
	
	/// 清空元素
	public void clear() {
		list.clear();
	}
}


