package shop.data;

import shop.command.UndoableCommand;

/**
 * Implementation of command to check in a video.
 * @see Data
 */
final class CmdIn implements UndoableCommand {
  private boolean _runOnce;
  private InventorySet _inventory;
  private Record _oldvalue;
  private Video _video;
  CmdIn(InventorySet inventory, Video video) {
    _inventory = inventory;
    _video = video;
  }
  public boolean run() {
    // TODO 
	  if (_runOnce) {
		  return false;
	  }
	  _runOnce = true;
	  if (_oldvalue != null) { return false; }
	  try {
		  _oldvalue = _inventory.checkIn(_video);
		  _inventory.getHistory().add(this);
		  return true;
	  } catch (IllegalArgumentException e) {
	      return false;
	    } catch (ClassCastException e) {
	      return false;
	    }
  }
  public void undo() {
    // TODO 
	  _inventory.replaceEntry(_video, _oldvalue);
  }
  public void redo() {
    // TODO  
	  _inventory.checkIn(_video);
  }
}
