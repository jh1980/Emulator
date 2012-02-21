/**
 * This view will display and accept input dealing with the Step By Step simulation
 * of the MIPS Simulator program.
 * @see JFrameView
 */


package view;

import interfaces.IController;
import interfaces.IModel;

import javax.swing.JTextField;

import model.Simulation;
import controller.StepByStepController;
import model.ModelEvent;

public class StepByStepView extends JFrameView {
	public StepByStepView(IModel aModel, IController aController) {
		super(aModel, aController);
		// TODO Auto-generated constructor stub
	}

	private JTextField _textField = new JTextField();
	public view.SimulationView.Handler _unnamed_Handler_;

	public void MIPSSIMView(Simulation aModel, StepByStepController aController) {
		throw new UnsupportedOperationException();
	}


	/**
	 * This method handles events that the model sends to the view and updates the view.
	 */
	public void modelChanged(ModelEvent aEvent) {
		throw new UnsupportedOperationException();
	}
}