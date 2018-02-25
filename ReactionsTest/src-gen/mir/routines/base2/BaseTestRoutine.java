package mir.routines.base2;

import java.io.IOException;
import mir.routines.base2.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class BaseTestRoutine extends AbstractRepairRoutineRealization {
  private BaseTestRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(@Extension final RoutinesFacade _routinesFacade) {
      System.out.println("test");
    }
  }
  
  public BaseTestRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.base2.BaseTestRoutine.ActionUserExecution(getExecutionState(), this);
  }
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine BaseTestRoutine with input:");
    
    userExecution.callRoutine1(this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
