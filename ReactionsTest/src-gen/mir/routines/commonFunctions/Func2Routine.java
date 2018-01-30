package mir.routines.commonFunctions;

import java.io.IOException;
import mir.routines.commonFunctions.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class Func2Routine extends AbstractRepairRoutineRealization {
  private Func2Routine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(@Extension final RoutinesFacade _routinesFacade) {
      System.out.println("func2");
    }
  }
  
  public Func2Routine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonFunctions.Func2Routine.ActionUserExecution(getExecutionState(), this);
  }
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine Func2Routine with input:");
    
    userExecution.callRoutine1(this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
