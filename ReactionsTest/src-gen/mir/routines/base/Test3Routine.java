package mir.routines.base;

import java.io.IOException;
import mir.routines.base.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class Test3Routine extends AbstractRepairRoutineRealization {
  private Test3Routine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final java.util.List<java.lang.String> list, @Extension final RoutinesFacade _routinesFacade) {
      String _plus = ("test3 with parameter " + list);
      System.out.println(_plus);
    }
  }
  
  public Test3Routine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final java.util.List<java.lang.String> list) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.base.Test3Routine.ActionUserExecution(getExecutionState(), this);
    this.list = list;
  }
  
  private java.util.List<java.lang.String> list;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine Test3Routine with input:");
    getLogger().debug("   list: " + this.list);
    
    userExecution.callRoutine1(list, this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
