package autoparkProject.collections.autoparkLists.api;

import autoparkProject.utils.loaders.api.CSVLoader;

import java.util.Comparator;
import java.util.List;

public abstract class AbstractAutoparkCollection<T> {

    private final List<T> list;

    public AbstractAutoparkCollection(String csv, CSVLoader<T> loader) {
        list = loader.load(csv);
    }

    public void insert(int index, T obj) {
        if (index < 0 || index > list.size()) {
            list.add(obj);
        } else {
            list.add(index, obj);
        }
    }

    public int delete(int index) {
        if (index < 0 || index > list.size()) {
            return -1;
        } else {
            list.remove(index);
            return index;
        }
    }

    public List<T> getList() {
        return list;
    }

    public void sort(Comparator<T> comparator) {
        list.sort(comparator);
    }
}
