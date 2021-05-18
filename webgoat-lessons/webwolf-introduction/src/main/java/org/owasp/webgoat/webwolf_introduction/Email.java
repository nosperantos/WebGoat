package org.owasp.webgoat.webwolf_introduction;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Email implements Serializable {

  private String contents;
  private String sender;
  private String title;
  private String recipient;
}
