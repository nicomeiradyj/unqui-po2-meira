package ar.edu.unq.po2.tp7;

import java.util.List;

public interface IShapeShifter {
	IShapeShifter compose(IShapeShifter other);
    int deepest();
    IShapeShifter flat();
    List<Integer> values();
}
