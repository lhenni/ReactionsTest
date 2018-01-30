package mir.routines.application;

import java.io.IOException;
import mir.routines.application.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class SomeDummyRoutineRoutine extends AbstractRepairRoutineRealization {
  private SomeDummyRoutineRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(@Extension final RoutinesFacade _routinesFacade) {
      System.out.println("someDummyRoutine");
    }
  }
  
  public SomeDummyRoutineRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.application.SomeDummyRoutineRoutine.ActionUserExecution(getExecutionState(), this);
  }
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine SomeDummyRoutineRoutine with input:");
    
    userExecution.callRoutine1(this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
