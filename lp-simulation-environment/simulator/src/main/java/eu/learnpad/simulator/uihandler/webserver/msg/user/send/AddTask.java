/**
 *
 */
package eu.learnpad.simulator.uihandler.webserver.msg.user.send;

/*
 * #%L
 * LearnPAd Simulator
 * %%
 * Copyright (C) 2014 - 2015 Linagora
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

import eu.learnpad.simulator.uihandler.webserver.msg.user.IUserMsg;

/**
 * @author Tom Jorquera - Linagora
 *
 */
public class AddTask implements IUserMsg {

	/**
	 * @param taskid
	 */
	public AddTask(String sessionid, String taskid) {
		super();
		this.sessionid = sessionid;
		this.taskid = taskid;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see activitipoc.uihandler.webserver.msg.user.UserMsg#getType()
	 */
	public TYPE getType() {
		return TYPE.ADDTASK;
	}

	public final String sessionid;
	public final String taskid;

}
