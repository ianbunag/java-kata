#!/bin/sh
function main() {
  local DIRECTORY_SRC="./src/main/java/dev/ianbunag/java_kata"
  local DIRECTORY_TEST="./src/test/java/dev/ianbunag/java_kata"
  local NAMESPACE=$(echo $1 | sed 's:/*$::')
  local CHALLENGE=$2
  local LAST_FILE=$(ls $DIRECTORY_SRC/$NAMESPACE | grep "^N\d.*\.java" | sort -V | tail -n 1)
  local LAST_COUNT=$(echo $LAST_FILE | grep -o "^N\d*" | grep -o "\d*")
  local NEXT_COUNT=$(($LAST_COUNT+1))
  local CHALLENGE_DIRECTORY_SRC="$DIRECTORY_SRC/$NAMESPACE"
  local CHALLENGE_DIRECTORY_TEST="$DIRECTORY_TEST/$NAMESPACE"
  local CHALLENGE_NAME_SRC="N$NEXT_COUNT$CHALLENGE"
  local CHALLENGE_NAME_TEST="N$NEXT_COUNT${CHALLENGE}Test"
  local CHALLENGE_CODE_SRC="$CHALLENGE_DIRECTORY_SRC/$CHALLENGE_NAME_SRC.java"
  local CHALLENGE_CODE_TEST="$CHALLENGE_DIRECTORY_TEST/$CHALLENGE_NAME_TEST.java"

  # @TODO numbering

  mkdir -p $CHALLENGE_DIRECTORY_SRC
  mkdir -p $CHALLENGE_DIRECTORY_TEST

  touch $CHALLENGE_CODE_SRC
  touch $CHALLENGE_CODE_TEST

  cat << EOF >> $CHALLENGE_CODE_SRC
package dev.ianbunag.java_kata.$NAMESPACE;

/**
 * Challenge solution.
 */
public class $CHALLENGE_NAME_SRC {
  private $CHALLENGE_NAME_SRC() { }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(1)
    *  <li>Worst time complexity:   O(1)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public static void challenge() {

  }
}
EOF
  cat << EOF >> $CHALLENGE_CODE_TEST
package dev.ianbunag.java_kata.$NAMESPACE;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class $CHALLENGE_NAME_TEST {
  @Test
  public void testChallenge() throws Exception {

  }
}
EOF

  echo "Scaffolded $CHALLENGE_CODE_SRC"
  echo "Scaffolded test $CHALLENGE_CODE_TEST"
}

main $*
