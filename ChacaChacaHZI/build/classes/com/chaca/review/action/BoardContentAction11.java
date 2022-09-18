����   4 u  *com/chaca/review/action/BoardContentAction  java/lang/Object  com/chaca/review/action/Action <init> ()V Code
     LineNumberTable LocalVariableTable this ,Lcom/chaca/review/action/BoardContentAction; execute x(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Lcom/chaca/review/action/ActionForward; 
Exceptions  java/lang/Exception	    java/lang/System   out Ljava/io/PrintStream;  :(from BoardContentAction) M: execute() 메서드 호출됨
     java/io/PrintStream ! " println (Ljava/lang/String;)V $ bno & ( ' %javax/servlet/http/HttpServletRequest ) * getParameter &(Ljava/lang/String;)Ljava/lang/String;
 , . - java/lang/Integer / 0 parseInt (Ljava/lang/String;)I 2 pageNum 4 com/chaca/review/db/BoardDAO
 3 
 3 7 8 9 updateReadcount (I)V ; java/lang/StringBuilder = '(from BoardContentAction) M: 글번호 
 : ?  "
 : A B C append (I)Ljava/lang/StringBuilder; E  조회수 +1 완
 : G B H -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 : J K L toString ()Ljava/lang/String;
 3 N O P getBoard !(I)Lcom/chaca/review/db/BoardDTO; R "(from BoardContentAction) M: dto: 
 : T B U -(Ljava/lang/Object;)Ljava/lang/StringBuilder; W dto & Y Z [ setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V ] %com/chaca/review/action/ActionForward
 \  ` ./reviewContent.jsp
 \ b c " setPath
 \ e f g setRedirect (Z)V request 'Ljavax/servlet/http/HttpServletRequest; response (Ljavax/servlet/http/HttpServletResponse; I Ljava/lang/String; dao Lcom/chaca/review/db/BoardDAO; Lcom/chaca/review/db/BoardDTO; forward 'Lcom/chaca/review/action/ActionForward; 
SourceFile BoardContentAction.java !            	   /     *� 
�           	                       	  8     �� � +#� % � +>+1� % :� 3Y� 5:� 6� � :Y<� >� @D� F� I� � M:� � :YQ� >� S� I� +V� X +1� X � \Y� ^:_� a� d�       :           '  -  H  P  g  q   { # � $ � % � '    R    �       � h i    � j k   � $ l   v 2 m  ' m n o  P D W p  �  q r   s    t