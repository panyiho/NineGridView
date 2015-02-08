package com.weixinninegridlayout;

import android.util.Log;


public final class L {
	private L() {
	}


	public static void v(Throwable t) {
		log(Log.VERBOSE, t, null);
	}

	public static void v(Object format, Object... args) {
		log(Log.VERBOSE, null, format, args);
	}

	public static void v(Throwable t, Object format, Object... args) {
		log(Log.VERBOSE, t, format, args);
	}

	public static void d(Throwable t) {
		log(Log.DEBUG, t, null);
	}

	public static void d(Object format, Object... args) {
		log(Log.DEBUG, null, format, args);
	}

	public static void d(Throwable t, Object format, Object... args) {
		log(Log.DEBUG, t, format, args);
	}

	public static void i(Throwable t) {
		log(Log.INFO, t, null);
	}

	public static void i(Object format, Object... args) {
		log(Log.INFO, null, format, args);
	}

	public static void i(Throwable t, Object format, Object... args) {
		log(Log.INFO, t, format, args);
	}

	public static void w(Throwable t) {
		log(Log.WARN, t, null);
	}

	public static void w(Object format, Object... args) {
		log(Log.WARN, null, format, args);
	}

	public static void w(Throwable t, Object format, Object... args) {
		log(Log.WARN, t, format, args);
	}

	public static void e(Throwable t) {
		log(Log.ERROR, t, null);
	}

	public static void e(Object format, Object... args) {
		log(Log.ERROR, null, format, args);
	}

	public static void e(Throwable t, Object format, Object... args) {
		log(Log.ERROR, t, format, args);
	}

	private static void log(final int pType, final Throwable t, final Object format,
			final Object... args) {
		final StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];

		final String fullClassName = stackTraceElement.getClassName();
		final String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
		final int lineNumber = stackTraceElement.getLineNumber();
		final String method = stackTraceElement.getMethodName();

		final String tag = new StringBuilder("[").append(Thread.currentThread().getId()).append("]")
				.append(className).append("<").append(lineNumber).append(">").toString();

		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(method);
		stringBuilder.append("(): ");

		if (format != null) {
			try {
				final String message = (args == null) ? format.toString() : String.format(
						(String) format, args);
				stringBuilder.append(message);
			} catch (Exception e) {
				stringBuilder.append("日志格式化异常：");
				stringBuilder.append(format.toString());
				e.printStackTrace();
			}
		}

		switch (pType) {
		case Log.VERBOSE:
			if (t != null) {
				Log.v(tag, stringBuilder.toString(), t);
			} else {
				Log.v(tag, stringBuilder.toString());
			}
			break;

		case Log.DEBUG:
			if (t != null) {
				Log.d(tag, stringBuilder.toString(), t);
			} else {
				Log.d(tag, stringBuilder.toString());
			}
			break;

		case Log.INFO:
			if (t != null) {
				Log.i(tag, stringBuilder.toString(), t);
			} else {
				Log.i(tag, stringBuilder.toString());
			}
			break;

		case Log.WARN:
			if (t != null) {
				Log.w(tag, stringBuilder.toString(), t);
			} else {
				Log.w(tag, stringBuilder.toString());
			}
			break;

		case Log.ERROR:
			if (t != null) {
				Log.e(tag, stringBuilder.toString(), t);
			} else {
				Log.e(tag, stringBuilder.toString());
			}
			break;
		}
		// }
	}
}
