package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.stream.Stream;

public class ShapeShifter implements IShapeShifter{
	
	private List<IShapeShifter> children;
	
	public ShapeShifter(List<IShapeShifter> children) {
		this.children = children;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter other) {
		return new ShapeShifter(Stream.concat(children.stream(), Stream.of(other)).toList());
	}

	@Override
	public int deepest() {
		return 1 + children.stream().mapToInt(child -> child.deepest()).max().orElse(0);
	}

	@Override
	public IShapeShifter flat() {
		List<IShapeShifter> leafs = children.stream().toList();
		return new ShapeShifter(leafs);
		
		
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
