import { logger } from '@/util/server-logger';

export async function POST(request: Request) {
  const { level, message, vars } = await request.json();
  logger.log(level, message, ...(vars || []));
  return new Response(null, { status: 204 });
}
