/**
 * A branch instruction is a specific kind of I type instruction that branches to a label.
 * @see IInstruction
 */
package model;

/**
 * @author Bob
 *
 */
public class BranchInstruction extends ITypeInstruction{
	
	private String label;

	public BranchInstruction(){
		super();
	}
	
	public BranchInstruction(String opc, int rd, int rs, int imm, int seqnum) {
		super(opc, rd, rs, imm, seqnum);
	}
	
	public BranchInstruction(String opc, int rd, int rs, int imm, int seqnum, String label) {
		super(opc, rd, rs, imm, seqnum);
		this.setLabel(label);
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String toString(){
		String message = getOpcode() + " " + getRS() + ", " + getRD() + ", " + label + "\n";
		return message;
	}
}
