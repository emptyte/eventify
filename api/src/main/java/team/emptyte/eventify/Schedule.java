package team.emptyte.eventify;

import org.fenixteam.storage.model.Model;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.ZonedDateTime;

public class Schedule implements Model {

  private final String id;
  private final byte priority;
  private ZonedDateTime startAt;

  public Schedule(
    String id,
    final byte priority
  ) {
    this.id = id;
    this.priority = priority;
  }

  @Override
  public @NotNull String id() {
    return this.id;
  }

  public byte priority() {
    return this.priority;
  }

  public boolean startNow() {
    return this.startAt == null;
  }

  public @Nullable ZonedDateTime startAt() {
    return this.startAt;
  }

  public void startAt(ZonedDateTime startAt) {
    this.startAt = startAt;
  }
}
