package ar.edu.unq.po2.tp7;

import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{
	
	private int value;
	
	public ShapeShifterLeaf(int value) {
		this.value = value;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter other) {
		return new ShapeShifter(List.of(this, other));
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return List.of(value);
	}
	
}
