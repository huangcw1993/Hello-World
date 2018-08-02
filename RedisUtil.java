public class RedisUtil {

	private static final Logger logger = LoggerFactory.getLogger(RedisUtil.class);

	public ShardedJedisPool getPool() {
		return pool;
	}
}
