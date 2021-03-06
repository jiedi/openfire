/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.plaso.thrift.gen;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TErrorCode implements org.apache.thrift.TEnum {
  COMMON_SERVER_INTERNAL_ERROR(1),
  COMMON_ACCESS_TOKEN_ERROR(2),
  COMMON_API_NOT_SUPPORT(3),
  COMMON_INPUT_DATA_ERROR(4),
  COMMON_NO_RECORD_FOUND(5),
  TUSERSERVICE_NO_SUCH_USER(101),
  TUSERSERVICE_WRONG_USER_OR_PASSWORD(102),
  TUSERSERVICE_USER_ALREADY_EXIST(103);

  private final int value;

  private TErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TErrorCode findByValue(int value) { 
    switch (value) {
      case 1:
        return COMMON_SERVER_INTERNAL_ERROR;
      case 2:
        return COMMON_ACCESS_TOKEN_ERROR;
      case 3:
        return COMMON_API_NOT_SUPPORT;
      case 4:
        return COMMON_INPUT_DATA_ERROR;
      case 5:
        return COMMON_NO_RECORD_FOUND;
      case 101:
        return TUSERSERVICE_NO_SUCH_USER;
      case 102:
        return TUSERSERVICE_WRONG_USER_OR_PASSWORD;
      case 103:
        return TUSERSERVICE_USER_ALREADY_EXIST;
      default:
        return null;
    }
  }
}
