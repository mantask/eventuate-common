package io.eventuate.tram.consumer.rabbitmq;

import java.util.Collections;
import java.util.Set;

public class Assignment {
  private String memberInstanceId;
  private String channelName;
  private AssignmentState state = AssignmentState.NORMAL;
  private Set<Integer> assignedPartitions = Collections.emptySet();
  private Set<Integer> resignedPartitions = Collections.emptySet();
  private Set<Integer> currentPartitions = Collections.emptySet();

  public Assignment() {

  }

  public Assignment(String memberInstanceId, String channelName) {
    this.memberInstanceId = memberInstanceId;
    this.channelName = channelName;
  }

  public Assignment(String memberInstanceId,
                    String channelName,
                    AssignmentState state,
                    Set<Integer> assignedPartitions,
                    Set<Integer> resignedPartitions,
                    Set<Integer> currentPartitions) {
    this.memberInstanceId = memberInstanceId;
    this.channelName = channelName;
    this.state = state;
    this.assignedPartitions = assignedPartitions;
    this.resignedPartitions = resignedPartitions;
    this.currentPartitions = currentPartitions;
  }

  public String getMemberInstanceId() {
    return memberInstanceId;
  }

  public void setMemberInstanceId(String subscriberId) {
    this.memberInstanceId = subscriberId;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public AssignmentState getState() {
    return state;
  }

  public void setState(AssignmentState state) {
    this.state = state;
  }

  public Set<Integer> getAssignedPartitions() {
    return assignedPartitions;
  }

  public void setAssignedPartitions(Set<Integer> assignedPartitions) {
    this.assignedPartitions = assignedPartitions;
  }

  public Set<Integer> getResignedPartitions() {
    return resignedPartitions;
  }

  public void setResignedPartitions(Set<Integer> resignedPartitions) {
    this.resignedPartitions = resignedPartitions;
  }

  public Set<Integer> getCurrentPartitions() {
    return currentPartitions;
  }

  public void setCurrentPartitions(Set<Integer> currentPartitions) {
    this.currentPartitions = currentPartitions;
  }
}
